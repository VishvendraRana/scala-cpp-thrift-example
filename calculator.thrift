namespace cpp com.rana.math
#@namespace scala com.rana.math

struct student {
    1: required i32 id,
    2: optional string name = "VS Rana",
    3: optional string dept = "CS";
}

service calculator {
    i32 add(1:i32 a, 2:i32 b),
    i32 sub(1:i32 a, 2:i32 b),
    i32 mult(1:i32 a, 2:i32 b),
    i32 div(1:i32 a, 2:i32 b);
    void display(1:string text);
    student getStudent(1:i32 id);
    oneway void printText(1:string text);
}
