package InheritenceDataTypeKullanimi;

public class M_Child extends L_Parent{
    public void method1(){
        System.out.println("Child method1");
    }


    public static void main(String[] args) {

        M_Child child1 = new M_Child(); //aramaya childdan baslar Child, Parent ve Grandparenti gezer en guncel olanı yazdırı
        child1.method1(); // Child method1

        L_Parent child2 = new M_Child(); //aramaya childdan baslar Obje parenttadır .Child, Parent ve Grandparenti gezer en guncel olanı yazdırır.
        child2.method1(); // Child method1

        K_GrandParent child3 = new M_Child();//aramaya grandparenttan baslar. Obje childdadır. Child, Parent ve Grandparenti gezer en guncel olanı yazdırır
        child3.method1(); // Child method1

        L_Parent parent1 = new L_Parent();// aramaya parenttan baslar. Obje parenttadır o yüzden alt sınıf olan child a bakmaz.
        // Parent ve Grandparenti gezer en guncel olanı yazdırır
        parent1.method1(); // parent method1

        K_GrandParent parent2 = new L_Parent();//aramaya grandparenttan baslar.Obje parenttadır o yüzden alt sınıf olan child a bakmaz.
        // Parent ve Grandparenti gezer en guncel olanı yazdırır
        parent2.method1(); // parent method1

        K_GrandParent gp1 = new K_GrandParent(); //Aramaya grand parenttan baslar. Obje grandparenttadır o yüzden alt sınıf olan parent ve child a bakmaz.
        //Sadece grandparenttaki methodu yazdırır.
        gp1.method1(); // GP method1
    }
}
