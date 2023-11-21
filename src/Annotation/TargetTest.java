package Annotation;

/**
 * ANNOTATION_TYPE  => 애너테이션
 * CONSTRUCTOR      => 생성자
 * FIELD            => 필드
 * LOCAL_VARIABLE   => 지역변수
 * METHOD           => 메서드
 * PACKAGE          => 패키지
 * PARAMETER        => 매개변수
 * TYPE             => 타입 (클래스, 인터페이스, enum)
 * TYPE_PARAMETER   => 타입 매개변수
 * TYPE_USE         => 타입이 사용되는 모든 곳
 */

import java.lang.annotation.Target;

import  static java.lang.annotation.ElementType.*;

@Target({FIELD, TYPE, TYPE_USE}) // 적용대상이 FIELD, TYPE, TYPE_USE
@interface MyAnnotation{} // MyAnnotation을 정의

@MyAnnotation // 적용대상이 TYPE인 경우
public class TargetTest {
    @MyAnnotation // 적용대상이 FIELD인 경우
    int i;
    
    @MyAnnotation // 적용대상이 TYPE_USE인 경우
    TargetTest tt;
}
