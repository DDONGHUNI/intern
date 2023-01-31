# 2023년 1월 20일

## Java를 기반으로 하는 Spring을 다루기 위한 기초 개념 공부 <br>

### ● Serializable
만든 클래스가 파일을 읽거나 쓸수 있도록 화거나 다른 서버로 보내거나 받을 수 있으려면<br>
Serializable 인터페이스를 구현해야됨.
<br>

### ● 접근지정자
private > default > protected > public <br>
| 한정자 | 클래스 | 동일 패키지 | 하위 클래스 | 그 외의 영역 |
|:---:|:---:|:---:|:---:|:---:|
public | ○ | ○ | ○ | ○ |
protected | ○ | ○ | ○ |  | 
default | ○ | ○ |  |  | 
private | ○ |  |  |  |
<br>

### ●  Resource & Autowired
- Resource : 주입하려고 하는 객체의 이름이 일치하는 객체를 자동으로 주입<br>
        ※ 필드, Setter 에 붙일 수 있음.
- Autowired : 주입하려고 하는 객체의 타입이 일치하는 객체를 자동으로 주입<br>
        ※ 필드, Setter, 생성자 에 붙일 수 있음.
<br>

### ●  Servlet
웹 통신에서 요청과 응답을 처리하는 자바 객체<br>
&nbsp;※ Tomcat 과 같은 WAS(Web Appliction Server)가 Servlet 엔진
<br>

### ● Http
- WWW 상에서 정보를 주고 받을 수 있는 프로토콜<br>
- Http를 통해 전달된 자료는 http:로 시작하는 URL로 조회 가능<br>
- https : SSL인증서를 이용하여 보안이 더 뛰어남
<br>

### ● HttpServletRequest & HttpServletResponse
- HttpServletRequest : Http의 request 정보를 저장하는 객체<br>
- HttpServletResponse : servlet이 클라이언트에게 전달할 정보를 저장하는 객체
<br>

### ● RequestMapping
요청된 URI를 어떻게 처리할지를 정하는 것<br>
    ※ ex) @RequestMapping("/_test") 와 같은 경우<br>
주소/_test 에서 class 즉 컨트롤러가 처리하는 것
<br>

### ● URI & URL 차이
- URI : 특정 리소스를 식별하는 통합 자원 식별자<br>
- URL : 웹 주소/ 네트워크 안에서 리소스가 어디있는지 알려주는 것
<br>

### ● Model
- key와 value 값으로 이루어진 HashMap (저장하는 것)<br>
- Model = 인터페이스 / ModelMap = 구현체<br>
- Model.addAttribute() : view에 전달할 데이터를 Model에 저장할 수 있음.<br>
- ModelAttribute() : 사용자가 요청시 전달하는 값을 오브젝트 형태로 매핑해주는 것 (저장)
<br>

### ● Controller & RestController
- Controller : Model 객체를 만들어 view를 반환하기 위해 사용<br>
- RestController : Json or Xml 형태로 객체 데이터를 반환하는 것<br>
                    ※ Controller에 ResponsBody 추가된 것
<br>

### ● Java HttpSession
- HttpSession은 Java의 인터페이스이며, 이를 사용하여 세션을 제어할 수 있음<br>
- 세션은 쿠키의 트래픽 이슈와 쿠키 변경으로 인한 보안 이슈를 해결하기 위해 등장
<br>

### ● Session
- session은 server와 client 간에 반영구적으로 상호작용하는 정보 교환<br>
- session은 server로 요청하는 client를 구별하기ㅇ 위해 server에 저장되는 정보<br>
- session은 client에 저장되는 쿠키와 다르게 server에 저장되므로 관리가 용이하고 효울적이며 보안에 강함<br>
- server는 client request에 session-id를 생성하여 server와 client 브라우저 메모리에 쿠키로 저장<br>
    ※ 일반적인 쿠키가 아닌 session 쿠키이며, 인 메모리 또는 임시, 반영구 쿠키로 불림<br>
- session 쿠키는 server가 종료되거나, 유효기간이 만료하거나, client 브라우저가 종료된면 삭제됨<br>
- session의 단점은 server resource를 사용하므로 server에 부담을 줄 수 있으며, 로드 밸런싱 시스템에서 session 처리가 쉽지 않음<br>
    ※ 로드 밸런싱 : server가 처리해야 할 업무 혹은 요청(Load)을 여러 대의 서버로 나누어(Balancing) 처리하는 것
