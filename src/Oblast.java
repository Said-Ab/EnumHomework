public enum Oblast {
    Chui("Capital city"),
    OSH("Kurmanjan Datke"),
    ISSIK_KOL("2nd highest Lake"),
    TALAS("Manas"),
    NARYN("River"),
    BATKEN("Batken"),
    JALAL_ABAD("Forest of Arslanbap");

    String Osobennost;
    Oblast(String Osobennost) {
        this.Osobennost=Osobennost;

    }

    @Override
    public String toString() {
        return "Oblast{" +
                "Osobennost='" + Osobennost + '\'' +
                "} " + super.toString();
    }
}
