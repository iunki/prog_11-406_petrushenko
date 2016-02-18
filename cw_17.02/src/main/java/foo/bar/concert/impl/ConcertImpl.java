package foo.bar.concert.impl;

import foo.bar.concert.Concert;
import foo.bar.member.Member;

import java.util.List;

public class ConcertImpl implements Concert {

    List<Member> members;

    ConcertImpl(){}

    ConcertImpl(List<Member> members){
        this.members = members;
    }

    @Override
    public void start() {
        for (Member member: members){
            member.act();
        }
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
