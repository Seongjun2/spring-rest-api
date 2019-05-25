package com.example.springrestapi.events;

import lombok.*;

import java.time.LocalDateTime;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id") // Entity 간에 상호 참조하는 경우 Stack Overflow가 발생될 수 있으므로
                              // id로 비교하는 것이 바람직 @Data를 쓰지 않는 이유도 @EqualsAndHashCode를 재정의하려고
public class Event {

    private Integer id;
    private String name;
    private String description;
    private LocalDateTime beginEnrollmentDateTime;
    private LocalDateTime closeEnrollmentDateTime;
    private LocalDateTime beginEventDateTime;
    private LocalDateTime endEventDateTime;
    private String location; // (optional) 없으면 온라인 모임
    private int basePrice; // (optional)
    private int maxPrice;  // (optional)
    private int limitOfEnrollment;
    private boolean offline;
    private boolean free;
    private EventStatus eventStatus = EventStatus.DRAFT;
}
