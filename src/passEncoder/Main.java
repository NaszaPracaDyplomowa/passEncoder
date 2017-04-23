package passEncoder;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Main {
    public static void main(String[] args) {
    	if(args.length == 1){
            String password = args[0];
            BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
            System.out.println(passwordEncoder.encode(password));
    	} else {
    		System.out.println("Args error " + args.length);
    	}
    }
}