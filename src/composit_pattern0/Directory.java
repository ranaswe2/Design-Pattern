package composit_pattern0;

import java.util.ArrayList;

public interface Directory {
    void show();
    String getName();
    void addF(Directory dir);
}


class Folders implements Directory{

    private String dname;
    private ArrayList<Directory> list= new ArrayList<>();

    public Folders(String dname) {
        this.dname = dname;
    }

    @Override
    public void show() {
        System.out.println(""+ getName());

        for(Directory f: list){
            f.show();
        }
    }

    @Override
    public String getName() {

        return dname;
    }

    public void addF(Directory dir) {
        list.add(dir);
    }
}



class Files implements Directory{
    private String fname;
    private ArrayList<Directory> list= new ArrayList<>();

    public Files(String fname) {
        this.fname = fname;
    }

    @Override
    public void show() {
        System.out.println("   "+ getName());
        }

    @Override
    public String getName() {
        return fname;
    }

    @Override
    public void addF(Directory dir) {
        //
    }

}

class MainDirectory{
    public static void main(String[] args) {
        Directory img1= new Files("   data.png");
        Directory slide1= new Files("   web.pptx");
        Directory img2= new Files("   algo.png");
        Directory slide2= new Files("   tech.pptx");
        Directory img3= new Files("   design.png");

        Directory dir1= new Folders("  images/");
        dir1.addF(img1);
        dir1.addF(img2);
        dir1.addF(img3);
        Directory dir2= new Folders("  slides/");
        dir2.addF(slide1);
        dir2.addF(slide2);
        Directory parent= new Folders("study/");
        parent.addF(dir1);
        parent.addF(dir2);
        parent.show();

    }
}
