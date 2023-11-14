import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Test001{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        /*使用函数式编程*/
        /* 第一种方式*/

        Stream<Integer> stream = list.stream();
        System.out.println(stream); //java.util.stream.ReferencePipeline$Head@7f31245a

        Stream<Integer> integerStream = list.stream().map(s -> s + 2);
        System.out.println(integerStream);//java.util.stream.ReferencePipeline$3@7cca494b

        List<Integer> listAdd = list.stream().map(s -> s + 2).collect(Collectors.toList());
        System.out.println("listAdd" + listAdd);//listAdd[3, 4, 5]
        /* 第二种方式*/
        List<Integer> listAdd02 = list.stream().map(Test001::add2).collect(Collectors.toList());
        System.out.println("listAdd02" + listAdd02);//listAdd02[3, 4, 5]
    }

    /*声明一个方法，加2，并返回结果*/
    private static int add2(Integer temp){
        return  temp + 2;
    }
}


