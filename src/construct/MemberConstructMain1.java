package construct;

public class MemberConstructMain1 {

  public static void main(String[] args) {
    MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
    MemberConstruct member2 = new MemberConstruct("user2", 16, 80);
    MemberConstruct[] members = {member1, member2};
  }
}
