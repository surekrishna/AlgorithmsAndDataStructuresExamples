import java.security.NoSuchAlgorithmException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.function.Supplier;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

public class TestUtils {

	private TestUtils() {
		throw new IllegalStateException("TestUtils class");
	}

	public static DateTimeFormatter getDateTimeFormatter(String format) {
		return DateTimeFormatter.ofPattern(format);
	}

	/**
	 * This method is used to generate 16-digit random key 1-6 chars -> GRVCHG 7-12
	 * chars -> MMYYYY 13-16 chars -> random 4-digit number
	 * 
	 * @return random 16 digit random key
	 * @throws NoSuchAlgorithmException
	 */
	public static String sixteenCharsStringDateNumberRandomKey1() {
		LocalDate now = LocalDate.now();
		return "GRVCHG" + now.format(getDateTimeFormatter("MMyyyy"))
				+ getRandomKeyByPatternAndLength(HrmsConstants.NUMBERS, 4);
	}

	/**
	 * This method is used to generate 16-digit random key 1-6 chars -> GRVNCE 7-12
	 * chars -> MMYYYY 13-16 chars -> random 4-digit number
	 * 
	 * @return random 16 digit random key
	 * @throws NoSuchAlgorithmException
	 */
	public static String sixteenCharsStringDateNumberRandomKey2() {
		LocalDate now = LocalDate.now();
		return "GRVNCE" + now.format(getDateTimeFormatter("MMyyyy"))
				+ getRandomKeyByPatternAndLength(HrmsConstants.NUMBERS, 4);
	}

	/**
	 * 
	 * @param str1 taking first three chars from input string
	 * @param str2 taking first three chars from input string
	 * @param date taking MMyyyy from input date
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static String fifteenCharsStringStringDateNumberRandomKey(String str1, String str2, LocalDate date) {
		if (str1.length() < 3)
			str1 = str1 + getRandomKeyByPatternAndLength(HrmsConstants.CAPITAL_ALPHABETS, 3 - str1.length());

		if (str2.length() < 3)
			str2 = str2 + getRandomKeyByPatternAndLength(HrmsConstants.CAPITAL_ALPHABETS, 3 - str2.length());

		if (isNullOrBlank(str1))
			str1 = getRandomKeyByPatternAndLength(HrmsConstants.CAPITAL_ALPHABETS, 3);

		if (isNullOrBlank(str2))
			str2 = getRandomKeyByPatternAndLength(HrmsConstants.CAPITAL_ALPHABETS, 3);

		return str1.substring(0, 3).toUpperCase() + str2.substring(0, 3).toUpperCase()
				+ date.format(getDateTimeFormatter("MMddyy"))
				+ getRandomKeyByPatternAndLength(HrmsConstants.NUMBERS, 3);
	}

	/**
	 * 
	 * @param str  taking first three chars from input string
	 * @param date taking MMyyyy from input date
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static String fifteenCharsStringDateNumberRandomKey(String str, LocalDate date) {
		if (str.length() < 3)
			str = str + getRandomKeyByPatternAndLength(HrmsConstants.CAPITAL_ALPHABETS, 3 - str.length());

		if (isNullOrBlank(str))
			str = getRandomKeyByPatternAndLength(HrmsConstants.CAPITAL_ALPHABETS, 3);

		return str.substring(0, 3).toUpperCase() + date.format(getDateTimeFormatter("MMddyy"))
				+ getRandomKeyByPatternAndLength(HrmsConstants.NUMBERS, 6);
	}

	/**
	 * This method is created for dynamic update of all the entities
	 * 
	 * @param existing
	 * @param updated
	 * @return
	 * @throws Exception
	 */
	public static Object updateObject(Object existing, Object updated) throws EntityValidationException {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setSkipNullEnabled(true).setMatchingStrategy(MatchingStrategies.STRICT);
		if (existing instanceof BaseEntity && updated instanceof BaseEntity) {
			BaseEntity existingEntity = (BaseEntity) existing;
			BaseEntity updatedEntity = (BaseEntity) updated;
			JSONObject newCustomProperties = updatedEntity.getCustomProperties();
			updatedEntity.setCustomProperties(null);
			modelMapper.map(updatedEntity, existingEntity);
			existingEntity.setCustomProperties(newCustomProperties);
		} else {
			modelMapper.map(updated, existing);
		}
		return existing;
	}

	/**
	 * This method is used to get fifteen digit random key with pattern example :-
	 * ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789
	 * 
	 * @return random key
	 */
	public static String getRandomKeyByPatternAndLength(String pattern, Integer length) {
		Integer base = pattern.length();

		Supplier<String> randomKey = () -> {
			StringBuilder sb = new StringBuilder();
			for (int i = 1; i <= length; i++) {
				sb.append(pattern.charAt((int) (Math.random() * base)));
			}
			return sb.toString();
		};
		return randomKey.get();
	}

	public static boolean isNullOrBlank(String str) {
		boolean isNullOrBlank = true;
		return null == str || str.isBlank() ? isNullOrBlank : !isNullOrBlank;
	}

	public static String twoCharsThreeNumbersRandomKey(String chars) {
		// nextInt(900) + 100 -> generate a random number from 0 to 899 and then add 100
		return chars + (new Random().nextInt(900) + 100);
	}

	public static String getNewEmployeeCode(Integer existingMaxNumber) {
		return null == existingMaxNumber ? "KRISH" + "0000111"
				: "KRISH" + String.format("%07d", existingMaxNumber + 1);
	}

	public static String getFourCharsAndSixDigitKey() {
		return getRandomKeyByPatternAndLength(HrmsConstants.CAPITAL_ALPHABETS, 4)
				+ getRandomKeyByPatternAndLength(HrmsConstants.NUMBERS, 6);
	}

	public static Integer getDayNumberOfWeek(String dayName) {
		DayOfWeek dayOfWeek = DayOfWeek.valueOf(dayName.toUpperCase());
		Integer dayNumber = dayOfWeek.getValue();
		return dayNumber;
	}

	public static boolean isNullOrZero(final Object obj) throws Exception {

		if (null == obj)
			return true;

		if (obj instanceof Integer) {
			Integer i = (Integer) obj;
			return (i == 0);
		}

		if (obj instanceof Long) {
			Long l = (Long) obj;
			return (l == 0);
		}
		throw new Exception("Unhandled Exception"); 
	}
