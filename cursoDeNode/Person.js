class Person {
  constructor(name) {
    this.name = name;
  }
  sayMyName() {
    return `my name is ${this.name}`;
  }
  sayMyRealName(){
    return "MY NAME IS"
  }
}
module.exports = Person;
