

// module 모듈명 {}
module my_module_a {
	
	// 모듈 프로젝트가 포함하고 있는 패키지를 외부에서 사용할 수 있도록 작성
	exports pack1;
	requires transitive my_module_b;
}