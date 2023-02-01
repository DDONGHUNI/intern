# 2023년 2월 1일

## To Do List 의 분석과 붙이고 싶은 기능 <br>

### ● Spring 언어 - H2 DB 사용<br>

### ● JPA 설정 이유 : 자바 프로그램에서 DB에 데이터를 저장 또는 조회하기 위해 설정<br>

### ● Entity : DB 테이블과 매핑되는 자바 클래스를 의미<br>

### ● @RequiredArgsConstructor - ToDoReposiotry 속성을 포함하는 생성자를 자동으로 생성해줌<br>

### ● @Auowired - 속성에 객체를 주입하는 방식<br>

### ● method="post" 로 들어오기 때문에 @PostMapping 사용<br>

### ● ToDoService.java 파일에서 void create, delete. update를 사용하여 DB의 연결된 내용을 변경할 수 있게 함<br>

### ● Thymeleaf<br>
- View Templete Engine으로 JSP, Freemarkerd와 같이 서버에서 클라이언트에게 응답할 브라우저 화면을 만들어주는 역할을 함<br>
- 간단하게 이해하면 jsp 다른 버전으로 생각하면 됨<br>

## DB

### ● 릴레이션 : 관계형 데이터베이스에서 정보를 구분하여 저장하는 기본 단위<br>

### ● 결국 릴레이션 = DB 테이블 / 하나의 릴레이션은 현실세계의 어떤 개체를 표현하고 저장하는데 사용<br>

### ● 기본키 & 외래키<br>

<h3>기본키(Primary Key)</h3>
- 정의 : 릴레이션을 대표하는 키, 기본키를 설정하면 다른 릴레이션의 외래키와 관계를 맺고 상호작용 가능<br>
- 릴레이션 내 튜플을 식별할 수 있는 고유한 값을 가져야 됨<br>
- NULL값은 허용하지 않음 (중복 X) / - 키 값 변함 X<br>

<h3>외래키(Foreign Key)</h3>
- 정의 : 다른 릴레이션의 기본키를 참조한 키<br>

### ● H2 DB : 메모리와 파일에 다 사용가능하지만 메모리 DB에 많이 사용<br>
- H2 DB를 따로 띄워주는 필요 없이 애플리케이션만 띄워주면 같이 나옴 / 편리하게 테스트가 가능함<br>
※ 주의할 점 애플리케이션이 죽을때 메모리에 남는 db이기 때문에 데이터가 다 삭제됨<br>

### ● IDENTITY - @GeneratedValue(strategy = GenerationType.IDENTITY)<br>
- 기본키 생성을 데이터베이스에 위임<br>
- 즉, id 값을 null로 하면 DB가 알아서 AUTO_INCREMENT 해줌<br>

### ● SEQUENCE - @GeneratedValue(strategy = GenerationType.IDENTITY)<br>
- 데이터베이스 Sequence Object를 사용<br>
- DB Sequence는 유일한 값을 순서대로 생성하는 특별한 데이터베이스 오브젝트<br>
- 테이블 마다 시퀀스 오브젝트를 따로 관리하고 싶으면 -> @SequenceGenerator에 sequenceName 속성을 추가<br>
- DB가 자동으로 숫자를 generate 해줌 / @SequenceGenerator 필요<br>

### ● To Do List 게시판에 추가하고 싶은 것<br>
- list 삭제해도 전 숫자로 돌아가는지 확인하기<br>
- 수정시 팝업창으로 화면 띄울 수 있는지 확인하기<br>
- list paging 처리하기<br>
- list 검색 기능<br>
- login 기능 추가 후 권한 부여하기<br>

![화면 캡처 2023-02-01 171512](https://user-images.githubusercontent.com/105115200/215987651-4d537215-cafd-4d46-b211-d3e719567434.png)
