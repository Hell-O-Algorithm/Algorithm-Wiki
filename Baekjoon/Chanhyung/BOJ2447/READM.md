### 별찍기 - 10 (<a href = "https://www.acmicpc.net/problem/2447">2447</a>)

---

### 입력

N : 패턴의 크기

### 풀이

** 1. 빈 배열 생성 **

```
const starArr = [];
```

** 2. 패턴의 크기 만큼 중첩 for문 **

```
const printStars = (num) => {
  for (let i = 0; i < num; i++) {
    for (let j = 0; j < num; j++) {
      star(i, j, num);
    }
    starArr.push('\n');
  }
};
```

** 3. star 함수 **

```
const star = (i, j, num) => {
  if (i % 3 == 1 && j % 3 == 1) {
    starArr.push(' ');
  } else {
    if (num == 1) {
      starArr.push('*');
    } else {
      star(parseInt(i / 3), parseInt(j / 3), parseInt(num / 3));
    }
  }
};
```

if 좌표가 (3n+1, 3n+1)인 곳은 공백으로 처리

```
 if (i % 3 == 1 && j % 3 == 1) {
    starArr.push(' ');
  }
```

else

- if(num === 1) starArr.push('\*');
- else 재귀 호출을 통해 몫이 1인 경우만 공백
