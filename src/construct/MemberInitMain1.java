package construct;

public class MemberInitMain1 {

  public static void main(String[] args) {
    MemberInit member1 = new MemberInit();
    member1.initMember("user1", 18, 90);

    MemberInit member2 = new MemberInit();
    member2.initMember("user2", 20, 95);

    MemberInit[] members = {member1, member2};
  }
}
