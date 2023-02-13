const fs = require('fs');
const input = fs
  .readFileSync('./dev/stdin')
  .toString()
  .trim()
  .split('\n')
  .map((v) => v.split(' '));

const N = +input[0][0];
const B = BigInt(input[0][1]);

const matrix = input.splice(1).map((v) => v.map((x) => +x % 1000));

const powMatrix = (matrix, k) => {
  if (k === BigInt(1)) return matrix;
  const temp = powMatrix(matrix, k / BigInt(2));
  if (k % BigInt(2) == BigInt(0)) {
    return multiMatrix(temp, temp);
  } else {
    return multiMatrix(multiMatrix(temp, temp), matrix);
  }
};

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

const answer = powMatrix(matrix, B)
  .map((elem) => elem.join(' '))
  .join('\n');
console.log(answer);
