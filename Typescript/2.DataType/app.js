var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
//syntax 1
var myName = "faizan";
console.log(myName, typeof myName);
//syntax 2
var age;
console.log(age, typeof age);
//syntax 3
var mobileNumber = 7795495076;
console.log(mobileNumber, typeof mobileNumber);
//syntax 4
var address;
address = 6789;
address = "faizan";
console.log(address, typeof address);
var calAge = function () {
    console.log("age is 26");
};
calAge();
var Person1 = /** @class */ (function () {
    function Person1(name, age) {
        this.name = name;
        this.age = age;
    }
    return Person1;
}());
var person1 = new Person1("faizan", 22);
console.log(person1);
var student = /** @class */ (function (_super) {
    __extends(student, _super);
    function student(name, age, rollNumber) {
        var _this = _super.call(this, name, age) || this;
        _this.name = name;
        _this.age = age;
        _this.rollNumber = rollNumber;
        return _this;
    }
    return student;
}(Person1));
var student1 = new student("faizan", 22, 36);
console.log(student1);
var student2 = new student("shareef", 22, 35);
console.log(student2);
