package OberverDesignPattern;

public interface Subject {
    void addOberver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
