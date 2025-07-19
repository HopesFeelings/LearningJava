package ex_017_This;

public class Lab_03_Passing_object_as_Argument  {

    public static void main(String[] args) {
        Pen p = new Pen();
        p.doingSome();
    }
}


class Pen {

    void doingSome()
    {
        Notebook n = new Notebook();
        n.receive(this);
    }

}


class Notebook {

        void receive(Pen obj)
        {
            System.out.println(obj);
        }
}
