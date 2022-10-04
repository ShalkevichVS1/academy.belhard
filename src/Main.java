import entity.ForBeauty;
import entity.User;
public class Main {

    public static void main(String[] args) {
        User user = new User(ForBeauty.scanner(), ForBeauty.scanner(), ForBeauty.scanner(), ForBeauty.scanner());
        System.out.print(user.getFullInfo() + "\nВведите для подтверждения пороль: ");
        System.out.println(user.isPasswordCorrect(ForBeauty.scanner()));

    }
}
