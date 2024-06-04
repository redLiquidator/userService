package org.egovframe.cloud.userservice.domain.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUser is a Querydsl query type for User
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUser extends EntityPathBase<User> {

    private static final long serialVersionUID = -1411786379L;

    public static final QUser user = new QUser("user");

    public final org.egovframe.cloud.servlet.domain.QBaseEntity _super = new org.egovframe.cloud.servlet.domain.QBaseEntity(this);

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final StringPath email = createString("email");

    public final StringPath encryptedPassword = createString("encryptedPassword");

    public final StringPath googleId = createString("googleId");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath kakaoId = createString("kakaoId");

    public final DateTimePath<java.time.LocalDateTime> lastLoginDate = createDateTime("lastLoginDate", java.time.LocalDateTime.class);

    //inherited
    public final StringPath lastModifiedBy = _super.lastModifiedBy;

    public final NumberPath<Integer> loginFailCount = createNumber("loginFailCount", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final StringPath naverId = createString("naverId");

    public final StringPath refreshToken = createString("refreshToken");

    public final EnumPath<org.egovframe.cloud.common.domain.Role> role = createEnum("role", org.egovframe.cloud.common.domain.Role.class);

    public final StringPath userId = createString("userId");

    public final StringPath userName = createString("userName");

    public final StringPath userStateCode = createString("userStateCode");

    public QUser(String variable) {
        super(User.class, forVariable(variable));
    }

    public QUser(Path<? extends User> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUser(PathMetadata metadata) {
        super(User.class, metadata);
    }

}

