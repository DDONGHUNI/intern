# 2023년 1월 30일

## 인턴 활동 중 본 오류 <br>

### ● Failed to start component [StandardEngine[Catalina].StandardHost[localhost].StandardContext[]]<br>
tomcat 오류 해결을 위해 eclipse의 clean 기능 사용<br>
eclipse clean : 파일 지우는 것 X<br>
사용하고 있던 정보나 class를 전부 삭제하고 다시 만드는 것<br>
clean 기능을 사용함으로써 빌드중에 꼬인걸 다시 새로 정리하는 개념<br>

## ToDoList 활동하면서 배운점 <br>

 Spring - H2 DB 사용<br>
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
JPA 설정 이유 : 자바 프로그램에서 DB에 데이터를 저장 또는 조회하기 위해 설정<br>
Entity : DB 테이블과 매핑되는 자바 클래스를 의미<br>

@RequiredArgsConstructor - ToDoReposiotry 속성을 포함하는 생성자를 자동으로 생성해줌<br>

@Auowired -  속성에 객체를 주입하는 방식<br>

method="post" 로 들어오기 때문에 @PostMapping 사용<br>

ToDoService.java 파일에서 void create, delete. update를 사용하여 DB의 연결된 내용을 변경할 수 있게 함<br>

H2 DB : 메모리와 파일에 다 사용가능하지만 메모리 DB에 많이 사용<br>
H2 DB를 따로 띄워주는 필요 없이 애플리케이션만 띄워주면 같이 나옴 / 편리하게 테스트가 가능함<br>
주의할 점 애플리케이션이 죽을때 메모리에 남는 db이기 때문에 데이터가 다 삭제됨<br>

Thymeleaf : View Templete Engine으로 JSP, Freemarkerd와 같이 서버에서 클라이언트에게 응답할 브라우저 화면을 만들어주는 역할을 함<br>
간단하게 이해하면 jsp 다른 버전으로 생각하면 됨<br>
