package org.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void SToT(Source i, Target j){
        j.setAnimal(i.getAnimal());
        j.setPeople(i.getPeople());
        j.setName("调用赋值成功");
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        for (int i = 1; i <= 5; i++) System.out.println("i = i + i");

        TestMode testMode = new TestMode(30, "明", 170);
        //获取class 对象
        Class<? extends TestMode> cla = testMode.getClass();
        //获取去类中的所有方法，返回一个method数组
        Method[] methods = cla.getDeclaredMethods();
        for (Method method : methods) {
            method.setAccessible(true);
            //获取当前方法的修饰符参数
            int modifiers = method.getModifiers();
            //获取该方法的参数
            Class<?>[] types = method.getParameterTypes();
            //只调用私有方法，并且参数必须是一个
            if (modifiers == Modifier.PRIVATE && types.length == 1) {
                try {

                    method.invoke(testMode, "我要开始调用方法了" + method.getName());
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }

        Source test1 =new Source.Builder(1)
                .animal(2)
                .name(222221)
                .build();
        Target test2 =new Target();
        SToT(test1,test2);
        System.out.print(test1+"\n");
        InputDTO input = new InputDTO.Builder(20)
                .y(5)
                .q(4)
                .p(2)
                .build();
        Calculate a = new Rooting();
        Calculate b = new BigAdd();
        Calculate c = new Power();

        System.out.print(b.cal(input)+"\n");
        System.out.print(c.cal(input)+"\n");
        String key1 = "Rooting";
        String key2 = "BigAdd";
        String key3 = "Power";
        List<String> method = new ArrayList<>();
        List<String> resultList = new ArrayList<>();
        method.add(key1);
        method.add(key2);
        method.add(key3);
        Map<String,Calculate> elementMap = new HashMap<>();
        elementMap.put(key1,a);
        elementMap.put(key2,b);
        elementMap.put(key3,c);
        for (String key:method)
        {
            String result = elementMap.get(key).cal(input);
            System.out.print(result+"\n");
            resultList.add(result);
        }
        System.out.println(resultList+"\n");
        System.out.print("计算完成，安全退出");
    }
}