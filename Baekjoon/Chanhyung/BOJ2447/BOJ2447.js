const input = require('fs')
  .readFileSync('/dev/stdin')
  .toString()
  .trim()
  .split('\n');
const starArr = [];

const printStars = (num) => {
  for (let i = 0; i < num; i++) {
    for (let j = 0; j < num; j++) {
      star(i, j, num);
    }
    starArr.push('\n');
  }
};
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
printStars(+input);
console.log(starArr.join(''));
