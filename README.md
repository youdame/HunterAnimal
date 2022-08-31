# HunterAnimal
콘솔창에서 이뤄지는 HunterAnimal 게임

<객체지향프로그래밍> 수업에서 자바를 배우고 처음으로 만들어 본 콘솔 형식의 게임입니다. 

__게임시나리오__

-	메뉴 
1. 바다에서 포획하기  2. 하늘에서 포획하기 3. 연구소에 동물 보내기
4. 연구하기 5. 연구 성과보기 6. 동물과의 친밀도 보기 7. 가방 크기 늘리기


상상 동물 연구소의 연구원은 상상 동물의 놀이 행태를 분석을 위해 용, 인어, 불사조, 유니콘을 직접 포획하러 다닌다.<br/>용과 인어는 바다에 살고, 불사조와 유니콘은 하늘에 산다. 

연구원은 메뉴에서 어디에서 포획할지 결정한다.<br/>흔하지 않은 동물들이기에, 잡을 수 있는 확률이 높지 않게 설정했다. 

먼저 동물을 만들어 놓지 않고, 특정 동물을 잡으면 그 동물에 해당하는 인스턴스를 생성했다.<br/>각각의 이름은 랜덤 숫자로 설정했고, 구별하기 위해 Animal의 toString 메소드에 종(category)과 이름을 둘 다 출력할 수 있게 했다

동물을 잡으면, 연구원은 동물을 자신의 가방에 넣는다. 가방 크기 초기 세팅은 3이며, 가방은 배열로 이뤄져있다. 가방이 꽉 차면 더이상 포획이 불가능하다.<br/> 가방은 private 메소드이기에 showBag 메소드를 통해 볼 수 있다. 가방을 비우기 위해서 가방에 있는 동물을 연구소에 보낼 수 있다.<br/> 연구소로 보내면 연구소의 동적 동물 배열에 동물이 추가된다. <br/>가방 사이즈를 늘릴 수 있는 기회는 한 번 주어지며, 연구소의 연구성과가 30(final 변수)이 넘으면 가능하다. <br/>가방을 사이즈 업 하면 6까지 커진다. 가방 사이즈 늘리기는 한 번만 가능하기에 두 번 이상 선택하면 사이즈업이 불가능하다고 뜬다.

연구소에서 연구를 할 수 있다. 상상 동물 연구소에서는 동물들의 놀이 행태 분석을 해야하기 때문에 동물들과 노는 것이 연구를 하는 것이다.<br/>연구를 하면, 연구 레벨이 올라가며 각 category(종) 별로 연구레벨이 따로 측정된다. 그래서 연구레벨은 클래스 변수(static)으로 설정했다. 
<br/>또한 연구를 하면 연구를 한 동물들과의 친밀도도 올라간다. 각 동물과의 친밀도이기 때문에 친밀도를 인스턴스 변수로 지정했다. 

메뉴에서 연구레벨 보기와 동물과의 친밀도 보기를 선택하면 현재 상태를 볼 수 있다.<br/>어떤 메뉴를 선택하더라도, 연구원의 가방과 연구소의 동물들은 자동으로 보여진다.