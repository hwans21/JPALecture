# JPALecture

#### 영속성 컨텍스트 
- 『엔티티를 영구 저장하는 환경』이라는 뜻
- EntityManager.persist(entity);
## 엔티티 생명주기
### 비영속(new/transient)
- 영속성 컨텍스트와 전혀 관계가 없는 새로운 상태
```
//객체를 생성한 상태(비영속)
Member member = new Member();
member.setId("member1");
member.setUsername("회원1");
```
### 영속(managed)
- 영속성 컨텍스트에 관리되는 상태
```
//객체를 생성한 상태(비영속)
Member member = new Member();
member.setId("member1");
member.setUsername(“회원1”);
EntityManager em = emf.createEntityManager();
em.getTransaction().begin();

//객체를 저장한 상태(영속)
em.persist(member);
```
### 준영속(detached)
- 영속성 컨텍스트에 저장되었다가 분리된 상태
### 삭제(remove)
- 삭제된 상태

## 영속성 컨텍스트의 이점
- 1차 캐시
- 동일성(identity) 보장
- 트랜잭션을 지원하는 쓰기 지연(transactional write-behind)
- 변경 감지(Dirty Checking)
- 지연 로딩(Lazy Loading)

