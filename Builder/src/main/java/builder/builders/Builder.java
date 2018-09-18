package builder.builders;

// Every qualified builder must know how to perform the following
public interface Builder<T> {
    void init();
    void setSeats(int number);
    void setRoof(boolean isCabriolet);
    void setVIN(String engineCode);
    void setTripComputer();
    T getResult();
}
