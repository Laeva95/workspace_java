package stringbuildertest;

public class StringBuilderExample2 {

	public static void main(String[] args) {
		
		String city = "서울특별시";
		String district = "강남구";
		String street = "테헤란로";
		String buildingNo = "123";
		String detail = "501호 (ABC빌딩)";
		
		StringBuilder sb = new StringBuilder()		// city + district + street + buildingNo + detail
				.append(city)
				.append(" ")
				.append(district)
				.append(" ")
				.append(street)
				.append(" ")
				.append(buildingNo)
				.append(" ")
				.append(detail);
		
		System.out.println(sb);
		
		String address = sb.toString();
		
		System.out.println(address);
		
	}
}
