package foo.bar.configuration;

import foo.bar.concert.Concert;
import foo.bar.concert.impl.ConcertImpl;
import foo.bar.instrument.impl.Bass;
import foo.bar.instrument.impl.Drums;
import foo.bar.instrument.impl.Guitar;
import foo.bar.member.Member;
import foo.bar.member.impl.MemberImpl;
import foo.bar.performer.Performer;
import foo.bar.performer.impl.Player;
import foo.bar.performer.impl.PlayerVocalist;
import foo.bar.performer.impl.Vocalist;
import foo.bar.song.Song;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public Concert concert() {
        ConcertImpl concert = new ConcertImpl();
        List<Member> members = new ArrayList<Member>();
        members.add(member1());
        members.add(member2());
        concert.setMembers(members);
        return concert;
    }

    @Bean
    public Member member1() {
        MemberImpl member = new MemberImpl();
        member.setBandName("Nirvana");
        member.setSongs(songs1());
        member.setPerformers(performers());
        return member;
    }

    @Bean
    public Member member2() {
        MemberImpl member2 = new MemberImpl();
        member2.setBandName("Stigmata");
        member2.setSongs(songs2());
        member2.setPerformers(performers());
        return member2;
    }

    @Bean
    public List<Song> songs1() {
        List<Song> songs1 = new ArrayList<Song>();
        songs1.add(new Song("Smells like teen spirit", "Hello, hello, hello, how low? Hello, hello, hello, how low?"));
        songs1.add(new Song("Heart-Shaped Box", "She eyes me like a Pisces when I am weak I've been locked inside your heart-shaped box for weeks"));
        return songs1;
    }

    @Bean
    public List<Song> songs2() {
        List<Song> songs2 = new ArrayList<Song>();
        songs2.add(new Song("Сентябрь", "Сентябрь горииит, убийца плачет, но он не смог поступить иначе"));
        songs2.add(new Song("Одиночество", "Боги предали тебя И отравленной росой Пустое тело омывали, Заглушая голос твой"));
        return songs2;
    }

    @Bean
    public List<Performer> performers() {
        List<Performer> performers = new ArrayList<Performer>();
        performers.add(new Player(new Guitar()));
        performers.add(new Player(new Bass()));
        performers.add(new Player(new Drums()));
        performers.add(new Vocalist());
        performers.add(new PlayerVocalist(new Guitar()));
        return performers;
    }
}
