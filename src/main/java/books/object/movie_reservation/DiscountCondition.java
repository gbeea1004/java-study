package books.object.movie_reservation;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
