package org.egovframe.cloud.userservice.domain.user;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QUserFindPasswordId is a Querydsl query type for UserFindPasswordId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QUserFindPasswordId extends BeanPath<UserFindPasswordId> {

    private static final long serialVersionUID = 1549188228L;

    public static final QUserFindPasswordId userFindPasswordId = new QUserFindPasswordId("userFindPasswordId");

    public final StringPath emailAddr = createString("emailAddr");

    public final NumberPath<Integer> requestNo = createNumber("requestNo", Integer.class);

    public QUserFindPasswordId(String variable) {
        super(UserFindPasswordId.class, forVariable(variable));
    }

    public QUserFindPasswordId(Path<? extends UserFindPasswordId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QUserFindPasswordId(PathMetadata metadata) {
        super(UserFindPasswordId.class, metadata);
    }

}

