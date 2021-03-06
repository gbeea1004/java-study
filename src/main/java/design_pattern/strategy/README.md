## 요구 사항

신작 게임에서 캐릭터와 무기를 구현해보기

무기는 두 종류가 있다
* 칼 / 총

캐릭터는 무기를 교체할 수 있다

---
## Strategy (전략) 패턴

특정 콘텍스트에서 알고리즘(전략)을 별도로 분리하는 설계 방법

> **콘텍스트** :  사람이 무기로 공격하는 책임을 가지고 있는 Person 클래스
>
> **전략** : 무기를 추상화하고 있는 Weapon 인터페이스



전략 패턴에서 콘텍스트는 사용할 전략을 직접 선택하지 않는다.
대신 콘텍스트의 클라이언트(Gun, Knife 클래스)가 콘텍스트에 사용할 전략을 `DI(의존 주입)`을 통해 전달해 준다.



### 장점

콘텍스트의 코드 변경 없이 새로운 전략을 추가할 수 있다.

전략 패턴을 적용함으로써 Person 클래스는 확장에는 열려있고 변화에는 닫혀있는 `OCP 원칙`을 따르는 구조를 갖게 된다.

if-else 코드를 전략 패턴을 적용함으로써 제거할 수 있다.

완전히 동일한 기능을 제공하지만 성능의 장단점에 따라 알고리즘을 선택해야 하는 경우에도 전략패턴을 사용한다.



### 단점

공격기능이 없는 캐릭터를 생성할 때 쓰이지도 않는 Weapon 참조 변수를 가지고 있어야 하며, 

weapon.attack() 메서드에 공격할 수 있는지에 대한 if문을 추가해 제약조건을 걸어 주어야 한다.

