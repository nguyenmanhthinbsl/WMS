package our.thinnm00mxytp3.wms.utils;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@Component
public class JwtTokenProvider {

    //Sau sẽ sử dụng Setting để get dữ liệu
    private final String JWT_SECRET = "thinnm00mxytp3";
    private final long JWT_EXPIRATION = 604800000L;

    public String generateToken(CustomUserDetails userDetails) {
        Instant now = Instant.now();
        Instant expiryDate = now.plus(JWT_EXPIRATION, ChronoUnit.SECONDS);
        // Tạo chuỗi json web token từ id của user.
        return Jwts.builder()
                .setSubject(userDetails.getUser().getId())
                .setIssuedAt(Date.from(now))
                .setExpiration(Date.from(expiryDate))
                .signWith(SignatureAlgorithm.HS512, JWT_SECRET)
                .compact();
    }
}
