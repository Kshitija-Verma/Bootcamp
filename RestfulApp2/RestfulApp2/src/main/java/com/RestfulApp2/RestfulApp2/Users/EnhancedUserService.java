package com.RestfulApp2.RestfulApp2.Users;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@Repository
public class EnhancedUserService {
    private static List<EnhancedUser> enhanceduser = new ArrayList<>();
    static Integer usercount=3;

    static{
        enhanceduser.add(new EnhancedUser("Kshitija ",1,21,"Modinagar",30000,10));
        enhanceduser.add(new EnhancedUser("Disha",2,22,"Delhi",40000,5));
        enhanceduser.add(new EnhancedUser("Anamika ",3,23,"Meerut",20000,8));
    }

    public List<EnhancedUser> findAll(){
        return enhanceduser;
    }

    public EnhancedUser findOne(int id){
        for(EnhancedUser enhancedUsers: enhanceduser){
            if(enhancedUsers.getId()==id)
                return enhancedUsers;
        }
        return null;
    }

    public EnhancedUser save(EnhancedUser users) {
        if (users.getId() == null) {
            users.setId(++usercount);
        }
        enhanceduser.add(users);
        return users;

    }
    public EnhancedUser findId(int id) {
        Iterator<EnhancedUser> iterator = enhanceduser.iterator();
        while(iterator.hasNext()){
            EnhancedUser users = iterator.next();
            if(users.getId()==id)
                return users;
        }
        return null;
    }
}
