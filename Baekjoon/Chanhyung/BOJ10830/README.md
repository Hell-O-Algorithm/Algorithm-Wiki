### 행렬 제곱 - 10 (<a href = "https://www.acmicpc.net/problem/10830">10830</a>)

---

### 입력

N : 행렬의 크기
B : 제곱 횟수
matrix : 행렬

### 풀이

** 1. 행렬 제곱 함수 **

```
const powMatrix = (matrix, k) => {
  if (k === BigInt(1)) return matrix;
  const temp = powMatrix(matrix, k / BigInt(2));
  if (k % BigInt(2) == BigInt(0)) {
    return multiMatrix(temp, temp);
  } else {
    return multiMatrix(multiMatrix(temp, temp), matrix);
  }
};

```

- 제곱의 수 k가 1인 경우 리턴
- 2이상인 경우 재귀
- 짝수인 경우 제곱
- 홀수인 경우 동일 행렬 제곱 & 리턴 행렬에 초기 행렬 한번 더 곱해준다.

** 2. 행렬 곱 함수 - multiMatrix **

```
const multiMatrix = (matrix1, matrix2) => {
  const C = changeMatrix(matrix2);
  const answer = [];
  for (let i = 0; i < N; i++) {
    answer.push([]);
    const X = matrix1[i];
    for (let j = 0; j < N; j++) {
      let sum = 0;
      const Y = C[j];
      for (let k = 0; k < N; k++) {
        sum += X[k] * Y[k];
      }
      answer[answer.length - 1].push(sum % 1000);
    }
  }
  return answer;
};
```

- 행렬 곱 계산을 쉽게 하기 위해 changeMatrix 함수 실행
- change된 matrix 를 통해 행렬 곱 실행

3. changeMatrix

```
const changeMatrix = (matrix) => {
  const answer = [];
  for (let i = 0; i < N; i++) {
    answer.push([]);
    for (let j = 0; j < N; j++) {
      answer[answer.length - 1].push(matrix[j][i]);
    }
  }
  return answer;
};
```

- 행렬 변환
