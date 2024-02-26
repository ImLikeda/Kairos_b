package com.kairos.sajotuna.SajoTuna.calendar.CalendarController;

import com.kairos.sajotuna.SajoTuna.calendar.CalendarDTO.CalendarDTO;
import com.kairos.sajotuna.SajoTuna.calendar.CalendarEntity.CalendarEntity;
import com.kairos.sajotuna.SajoTuna.calendar.CalendarService.CalendarService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class CalendarController {
    private final CalendarService calendarService;
    @PostMapping("/saveCalendar")
    public ResponseEntity<?> saveCalendar(@RequestBody CalendarDTO calendarDTO, HttpServletResponse response){
        try{
            calendarService.save(calendarDTO);
            return ResponseEntity.status(HttpStatus.OK).build();
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"data\": \"회원가입에 실패하였습니다.\"}");
        }
    }
    @GetMapping("find/calendar/{calendarId}")
    public ResponseEntity<?> findCalendar(@PathVariable("calendarId") int calendarId,HttpServletResponse response){
        if (calendarService.FindByCalendarId(calendarId) == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"data\": \"데이터가 없습니다.\"}");
        }
        else{
                CalendarDTO calendarDTO = CalendarDTO.toCalendarDTO(calendarService.FindByCalendarId(calendarId));
                return new ResponseEntity<>(calendarDTO,HttpStatus.OK);
        }
    }

}
