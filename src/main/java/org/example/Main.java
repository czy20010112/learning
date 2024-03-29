package org.example;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void SToT(source i, target j){
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

                    method.invoke(testMode, "我要开始调用1方法了" + method.getName());
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }

        source test1 =new source.Builder(1)
                .animal(2)
                .name(222221)
                .build();
        target test2 =new target();
        SToT(test1,test2);
        System.out.print(test1);
        inputDTO input = new inputDTO.Builder(20)
                .y(5)
                .build();




    }
}