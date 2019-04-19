
import com.springmvc.dao.TeamMapper;
import com.springmvc.entity.Team;
import com.springmvc.service.TeamService;
import com.springmvc.service.impl.TeamServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: Administrator
 * @Date: 2019/4/17 15:57
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-*.xml"})
public class TeamTest {
    @Autowired
    private TeamService service;
    @Autowired
    private TeamMapper mapper;
    @Test
    public void team(){
        Team team = new Team();
        team.setId(1);
        List<Team> teamList = service.queryByExample(team);
        if (!teamList.isEmpty()){
            for (int i = 0; i < teamList.size(); i++) {
                Team team1 =  teamList.get(i);
                System.out.println(team1.getTname());
            }
        }
    }
}
