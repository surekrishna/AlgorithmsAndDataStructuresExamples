package com.vit.products.intrak.common.discovery;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		var general = general();
		var technical = techincal();
		var manager = manager();
		
		System.out.println("General");
		System.out.println("======");
		general.forEach(gen -> System.out.println(gen));
		System.out.println("Technical");
		System.out.println("=========");
		technical.forEach(tec -> System.out.println(tec));
		System.out.println("Manager");
		System.out.println("=======");
		manager.forEach(man -> System.out.println(man));

		Map<String, List<EmployeeDto>> result = new HashMap<>();
		result.put("general", general);
		result.put("technical", technical);
		result.put("manager", manager);
		
		Map<String, Integer> index = new HashMap<>();
		index.put("general", 0);
		index.put("technical", 0);
		index.put("manager", 0);
		
		
		List<EmployeeDto> all = new ArrayList<>();
		all.addAll(general);
		all.addAll(technical);
		all.addAll(manager);
		
		System.out.println("All");
		System.out.println("===");
		all.forEach(a -> System.out.println(a));
		
		System.out.println("Finding minDate ");
		System.out.println("===============");
		var minDate = all.stream().min(Comparator.comparing(EmployeeDto::getPositionDoj)).get();
		System.out.println(minDate);
		
		System.out.println("=========================");
		all.remove(minDate);
		
		all.add(0, minDate);
		all.forEach(a -> System.out.println(a));
	
		
		result(result, index);
	}

	private static void result(Map<String, List<EmployeeDto>> result, Map<String, Integer> index) {
		List<EmployeeDto> finalResult = new ArrayList<>();
		List<EmployeeDto> temp = new ArrayList<>();
		List<EmployeeDto> all = new ArrayList<>();
		Boolean condition = true;
		for(Map.Entry<String, List<EmployeeDto>> entry : result.entrySet())
			all.addAll(entry.getValue());
		
		while(!all.isEmpty()) {
			EmployeeDto minDate = all.stream().min(Comparator.comparing(EmployeeDto::getPositionDoj)).get();
			
			for(Map.Entry<String, List<EmployeeDto>> entry : result.entrySet()) {
				String key = entry.getKey();
				List<EmployeeDto> value = entry.getValue();
				if(value.contains(minDate)) {
					Integer individualIndex = index.get(key);
					Integer minIndividualIndex = value.indexOf(minDate); 
					if(individualIndex !=  minIndividualIndex && individualIndex < minIndividualIndex) {
						index.put(key, minIndividualIndex+1);
						while(condition) {
							temp.add(0, value.get(minIndividualIndex));
							all.remove(value.get(minIndividualIndex));
							if(individualIndex == minIndividualIndex)
								condition = false;
							minIndividualIndex--;
						}
						break;
					}else if(individualIndex == minIndividualIndex) {
						index.put(key, minIndividualIndex+1);
						temp.add(0, value.get(minIndividualIndex));
						all.remove(value.get(minIndividualIndex));
					}
				}
			}
			condition = true;
			finalResult.addAll(temp);
			temp.clear();
		}
		
		System.out.println("Final Result");
		System.out.println("============");
		finalResult.forEach(a -> System.out.println(a));
	}
	
	
	private static List<EmployeeDto> general(){
		List<EmployeeDto> general = new ArrayList<>();
		general.add(new EmployeeDto(1L, "Sachin", LocalDate.of(2001, 2, 6), 1995, LocalDate.of(1972, 1, 1)));
		general.add(new EmployeeDto(34L, "Rahul", LocalDate.of(2001, 3, 14), 1997, LocalDate.of(1980, 1, 1)));
		general.add(new EmployeeDto(42L, "Zahir", LocalDate.of(2001, 1, 15), 1992, LocalDate.of(1985, 1, 1)));
		general.add(new EmployeeDto(18L, "Mahi", LocalDate.of(2001, 9, 11), 1990, LocalDate.of(1977, 1, 1)));
		general.add(new EmployeeDto(200L, "Pandya", LocalDate.of(2001, 11, 22), 1993, LocalDate.of(1966, 1, 1)));
		general.add(new EmployeeDto(178L, "Gangualy", LocalDate.of(2001, 04, 27), 1997, LocalDate.of(1973, 1, 1)));
		return general;
	}
	
	private static List<EmployeeDto> techincal(){
		List<EmployeeDto> general = new ArrayList<>();
		general.add(new EmployeeDto(4L, "Brett", LocalDate.of(2001, 6, 8), 1990, LocalDate.of(1975,1, 1)));
		general.add(new EmployeeDto(21L, "Simon", LocalDate.of(2001, 7, 18), 1991, LocalDate.of(1962, 1, 1)));
		general.add(new EmployeeDto(12L, "Linda", LocalDate.of(2001, 1, 18), 1987, LocalDate.of(1976, 1, 1)));
		general.add(new EmployeeDto(87L, "George", LocalDate.of(2001, 11, 11), 1989, LocalDate.of(1991, 1, 1)));
		general.add(new EmployeeDto(302L, "Katy", LocalDate.of(2001, 4, 20), 1982, LocalDate.of(1978,1, 1)));
		general.add(new EmployeeDto(152L, "Jasmine", LocalDate.of(2001, 5, 17), 1984, LocalDate.of(1969, 1, 1)));
		return general;
	}
	
	private static List<EmployeeDto> manager(){
		List<EmployeeDto> general = new ArrayList<>();
		general.add(new EmployeeDto(100L, "Scoot", LocalDate.of(2001, 4, 5), 1985, LocalDate.of(1972, 1, 1)));
		general.add(new EmployeeDto(190L, "Miller", LocalDate.of(2001, 1, 10), 1979, LocalDate.of(1984, 1, 1)));
		general.add(new EmployeeDto(167L, "Kaif", LocalDate.of(2001, 5, 15), 1991, LocalDate.of(1989, 1, 1)));
		general.add(new EmployeeDto(31L, "Rayudu", LocalDate.of(2001, 4, 20), 1983, LocalDate.of(1990, 1, 1)));
		general.add(new EmployeeDto(39L, "Pathan", LocalDate.of(2001, 10, 18), 1993, LocalDate.of(1976, 1, 1)));
		general.add(new EmployeeDto(92L, "Rhodes", LocalDate.of(2001, 8, 21), 1988, LocalDate.of(1987, 1, 1)));
		return general;
	}

}

class EmployeeDto {
	private Long id;
	private String name;
	private LocalDate positionDoj;
	private Integer yearOfAllotment;
	private LocalDate dob;
	
	public EmployeeDto() {
		
	}

	public EmployeeDto(Long id, String name, LocalDate positionDoj, Integer yearOfAllotment, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.positionDoj = positionDoj;
		this.yearOfAllotment = yearOfAllotment;
		this.dob = dob;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getPositionDoj() {
		return positionDoj;
	}

	public void setPositionDoj(LocalDate positionDoj) {
		this.positionDoj = positionDoj;
	}

	public Integer getYearOfAllotment() {
		return yearOfAllotment;
	}

	public void setYearOfAllotment(Integer yearOfAllotment) {
		this.yearOfAllotment = yearOfAllotment;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "EmployeeDto [id=" + id + ", name=" + name + ", positionDoj=" + positionDoj + ", yearOfAllotment="
				+ yearOfAllotment + ", dob=" + dob + "]";
	}
	
}
