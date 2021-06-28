🤘 스프링 부트로 로그인 기능이 없는 블로그 만들기 🤘
 ------------------------------------

1. [프로젝트 소개](#프로젝트-소개)
2. [서비스 기능](#서비스-기능)

## 프로젝트 소개
```항해로그``` 는 java,spring-boot로 만들어진 로그인 없이 CRUD를 구현한 프로젝트 입니다.


## 서비스 기능
 1. 게시글 전체 목록 보기.
 2. 게시글 작성.
 3. 게시글 상세조회.
 4. 게시글 삭제.

## API 설계

|기능|method|URL|반환|
|-----|-----|-----|-----|
|게시글 전체 조회|GET|/api/board|List\<board>|
|게시글 작성|POST|/api/board|Board|
|게시글 상세조회|GET|/api/board/detail|board|
|게시글 삭제|PUT|/api/board/delete|""|

