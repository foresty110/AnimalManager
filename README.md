# AnimalManager
사전캠프 최종 과제: 동물 관리 시스템 만들기

```mermaid
classDiagram

class Animal {
<<abstract>>
  - String name
  - int age
  - int hunger
  - int happiness
  + Animal(String, int)
  + getName() String
  + getAge() int
  + bark()
}

class Dog {
  + Dog(String, int)
  + bark()
}

class Cat {
  + Cat(String, int)
  + bark() 
}

class AnimalManagement{
  regist() // 동물 등록
  showList() // 동물 목록 조회 
  sound() // 동물 소리 듣기 
  feed() // 먹이주기
  play() // 놀아주기
  sound() // 울음 소리 듣기 
  checkStatus() // 상태 조회
  showMenu() // 관리 메뉴 출력
}

class Main {
	main()
}

Animal <|-- Cat
Animal <|-- Dog
```
