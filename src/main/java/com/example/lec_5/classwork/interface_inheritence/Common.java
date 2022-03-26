package pingwit.lec_5.classwork.interface_inheritence;

public interface Common extends AlwaysSleep {
}

interface AlwaysSleep extends NeverSleep, GoodNight {

    void sayHi();
}
interface NeverSleep extends GoodNight{

    void sayBy();
}
interface GoodNight{

    void Nalivai();
}
class Man implements AlwaysSleep {
    @Override
    public void sayHi() {

    }

    @Override
    public void sayBy() {

    }

    @Override
    public void Nalivai() {

    }
}

