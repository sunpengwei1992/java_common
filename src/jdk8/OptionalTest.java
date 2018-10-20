package jdk8;


import java.util.Optional;
import java.util.function.Supplier;

/**
 * @创建人 sunpengwei
 * @创建时间 2018/9/11
 * @描述
 * @联系邮箱 sunpengwei@jd.com
 */
public class OptionalTest {

    public static void main(String[] args) throws RuntimeException {
        CollectionsGroupTest.Student student = new CollectionsGroupTest.Student(1, "1", "spw");

        String s = Optional.ofNullable(student.getName()).orElseGet(() -> {
            return "spw";
        });
        System.out.println(s);
        System.out.println(student.getName());

        try {

        } catch (Exception e) {

        }
        Optional.ofNullable(student.getName()).orElseThrow(new Supplier<RuntimeException>() {
            @Override
            public RuntimeException get() {
                return new RuntimeException("ss");
            }
        });
        String s1 = Optional.ofNullable(student.getName()).orElseGet(new Supplier<String>() {
            @Override
            public String get() {
                return "s";
            }
        });
        student.setName(Optional.ofNullable(student.getName()).orElse("ss"));
        student.setName(s1);
    }

}