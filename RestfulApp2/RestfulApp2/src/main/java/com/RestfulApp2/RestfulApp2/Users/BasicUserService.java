package com.RestfulApp2.RestfulApp2.Users;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Repository
public class BasicUserService {
    private static List<BasicUser> basicuser = new ArrayList<>();
    static Integer usercount=3;

    static{
        basicuser.add(new BasicUser("Kshitija ",1));
        basicuser.add(new BasicUser("Disha",2));
        basicuser.add(new BasicUser("Anamika ",3));
    }

    public List<BasicUser> findAll(){
        return basicuser;
    }

    public BasicUser findOne(int id){
        for(BasicUser basicUsers: basicuser){
            if(basicUsers.getId()==id)
                return basicUsers;
        }
        return null;
    }

    public BasicUser save(BasicUser users) {
        if (users.getId() == null) {
            users.setId(++usercount);
        }
        basicuser.add(users);
        return users;

    }
    public BasicUser findId(int id) {
        Iterator<BasicUser> iterator = basicuser.iterator();
        while(iterator.hasNext()){
            BasicUser users = iterator.next();
            if(users.getId()==id)
                return users;
        }
        return null;
    }
}
