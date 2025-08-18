package com.revisao.exam_170_829.TIPOS_DADOS.TIPOS_DE_DADOS_E_OPERACOES;

import java.sql.SQLOutput;
import java.sql.Time;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.IsoFields;

public class DataHora {
    /*
    * LocalDate, LocalTime e LocalDateTime
    * Time, Duration e Period
    * Instant, ZoneID. ZonedDateTime. OffsetDateTime e DateTimeFormatter
    * ChronoUnit e ChronoField
    * TemporalAdjusters
    * */

    public static void main(String[] args) {
        // LocalDate, LocalTime e LocalDateTime

        // LocalDate - representa uma data (ano, mês, dia) sem hora
        LocalDate localDate = LocalDate.now();
        int diasDoMes = localDate.lengthOfMonth();
        int diasDoAno = localDate.lengthOfYear();
        int numeroDoMes = localDate.getMonthValue();
        int numeroDoDia = localDate.getDayOfMonth();
        int numeroDoDiaNoAno = localDate.getDayOfYear();

        // LocalTime - representa um horário (hora, minuto, segundo, nanossegundo) sem data
        LocalTime localTime = LocalTime.now();
        int segundosDoDia = localTime.toSecondOfDay();
        int segundosDoMes = localTime.toSecondOfDay() * diasDoMes;
        int segundosDoAno = localTime.toSecondOfDay() * diasDoAno;
        int horas = localTime.getHour();
        int minutos = localTime.getMinute();
        int segundos = localTime.getSecond();
        int nanos = localTime.getNano();


        // LocalDateTime - representa uma data e hora (ano, mês, dia, hora, minuto, segundo, nanossegundo)
        // Todos os metodos que tem no LocalDate e LocalTime, tem no LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("Local Date: " + localDate);
        System.out.println("diasDoMes: " + diasDoMes);
        System.out.println("diasDoAno: " + diasDoAno);
        System.out.println("dia: " + numeroDoDia);
        System.out.println("mes: " + numeroDoMes);
        System.out.println("Dia do ano: " + numeroDoDiaNoAno);
        System.out.println("------------------------");

        System.out.println("Local Time: " + localTime);
        System.out.println("segundosDoDia: " + segundosDoDia);
        System.out.println("segundosDoMes: " + segundosDoMes);
        System.out.println("segundosDoAno: " + segundosDoAno);
        System.out.println("horas: " + horas);
        System.out.println("minutos: " + minutos);
        System.out.println("segundos: " + segundos);
        System.out.println("nanos: " + nanos);
        System.out.println("------------------------");

        System.out.println("Local Date Time: " + localDateTime);

        // Time, Duration e Period

        // Time - representa um horário (hora, minuto, segundo) sem data
        Time time = new Time(System.currentTimeMillis());
        Time minutosTime1 = new Time(System.currentTimeMillis() + 60000); // adiciona 1 minuto
        Time horasTime1 = new Time(System.currentTimeMillis() + 3600000); // adiciona 1 hora
        Time dias = new Time(System.currentTimeMillis() + 86400000); // adiciona 1 dia
        Time semana = new Time(System.currentTimeMillis() + 3600000); // adiciona 1 semana
        Time mes = new Time(System.currentTimeMillis() + 2592000000L); // adiciona 1 mês (30 dias)
        Time ano = new Time(System.currentTimeMillis() + 31536000000L); // adiciona 1 ano (365 dias)

        System.out.println("Time: " + time);
        System.out.println("minutos: " + minutosTime1);
        System.out.println("horas: " + horasTime1);
        System.out.println("dias: " + dias);
        System.out.println("semana: " + semana);
        System.out.println("mes: " + mes);
        System.out.println("ano: " + ano);

        // Duration - representa um intervalo de tempo entre duas datas ou horários
        Duration duration = Duration.between(localTime, localTime.plusHours(1)); // intervalo de 1 hora

        long segundosDuration1 = duration.getSeconds(); // retorna o total de segundos no intervalo
        long diasDuration1 = duration.toDays(); // retorna o total de dias no intervalo
        long horasDuration1 = duration.toHours(); // retorna o total de horas no intervalo
        long minutosDuration1 = duration.toMinutes(); // retorna o total de minutos no intervalo

        System.out.println("segundos: " + segundosDuration1);
        System.out.println("dias: " + diasDuration1);
        System.out.println("horas: " + horasDuration1);
        System.out.println("minutos: " + minutosDuration1);

        // Period - representa um intervalo de tempo em termos de anos, meses e dias entre duas datas
        Period period = Period.between(localDate, localDate.plusDays(10)); // intervalo de 10 dias
        Period periodAno = Period.between(localDate, localDate.plusYears(1)); // intervalo de 1 ano

        int diasPeriod = period.getDays(); // retorna o total de dias no intervalo
        int mesesPeriod = period.getMonths(); // retorna o total de meses no intervalo
        int anosPeriod = period.getYears(); // retorna o total de anos no intervalo

        int anosPeriod1 = periodAno.getYears(); // retorna o total de anos no intervalo


        System.out.println("dias: " + diasPeriod);
        System.out.println("meses: " + mesesPeriod);
        System.out.println("anos: " + anosPeriod);

        System.out.println("anosPeriod1: " + anosPeriod1);
        System.out.println("quantidade de meses no ano: " + anosPeriod1 * 12);
        System.out.println("dias no ano: " + anosPeriod1 * localDate.lengthOfYear());

        System.out.println("------------------------");

        // Instant, ZoneID. ZonedDateTime. OffsetDateTime e DateTimeFormatter

        // Instant - representa um ponto no tempo (timestamp) em UTC
        Instant instant = Instant.now();
        Instant instantMais1Hora = instant.plusSeconds(3600); // adiciona 1 hora

        Instant nowUtcBrazil = Instant.now().plusSeconds(-10800); // Horário de Brasília (UTC-3)
        Instant nowUtcBrazil1HoraAdicionada = Instant.now().plusSeconds(-10800 + 3600); // Horário de Brasília (UTC-3) mais 1 hora

        System.out.println("Instant: " + instant);
        System.out.println("Instant mais 1 hora: " + instantMais1Hora);

        System.out.println("Agora em UTC-3 (Horário de Brasília): " + nowUtcBrazil);
        System.out.println("Agora em UTC-3 (Horário de Brasília) mais 1 hora: " + nowUtcBrazil1HoraAdicionada);

        System.out.println("------------------------");

        // ZoneID - representa um fuso horário
        ZoneId zoneId = ZoneId.systemDefault();
        ZoneId zoneIdUtc = ZoneId.of("UTC"); // Fuso horário UTC
        ZoneId zoneIdUtcMinus3 = ZoneId.of("America/Sao_Paulo"); // Fuso horário de Brasília (UTC-3)
        ZoneId zoneIdUtcPlus1 = ZoneId.of("Europe/London"); // Fuso horário de Londres (UTC+1)
        ZoneId zoneAsia = ZoneId.of("Asia/Tokyo"); // Fuso horário do Japão

        System.out.println("Fuso Horario do sistema: " + zoneId);
        System.out.println("Fuso Horario UTC: " + zoneIdUtc);
        System.out.println("Fuso Horario UTC-3 (Brasília): " + zoneIdUtcMinus3);
        System.out.println("Fuso Horario UTC+1 (Londres): " + zoneIdUtcPlus1);
        System.out.println("Fuso Horario Asia/Tokyo: " + zoneAsia);

        System.out.println("------------------------");

        // ZonedDateTime - representa uma data e hora com fuso horário
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        ZonedDateTime zonedDateTimeUtc = ZonedDateTime.now(zoneIdUtc); // Fuso horário UTC
        ZonedDateTime zonedDateTimeUtcMinus3 = ZonedDateTime.now(zoneIdUtcMinus3); // Fuso horário de Brasília (UTC-3)
        ZonedDateTime zonedDateTimeUtcPlus1 = ZonedDateTime.now(zoneIdUtcPlus1);
        ZonedDateTime zonedDateTimeAsia = ZonedDateTime.now(zoneAsia); // Fuso horário do Japão

        System.out.println("ZonedDateTime: " + zonedDateTime);
        System.out.println("ZonedDateTime UTC: " + zonedDateTimeUtc);
        System.out.println("ZonedDateTime UTC-3 (Brasília): " + zonedDateTimeUtcMinus3);
        System.out.println("ZonedDateTime UTC+1 (Londres): " + zonedDateTimeUtcPlus1);
        System.out.println("ZonedDateTime Asia/Tokyo: " + zonedDateTimeAsia);

        System.out.println("------------------------");

        // OffsetDateTime - representa uma data e hora com um deslocamento de fuso horário
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        OffsetDateTime offsetDateTimeUtc = OffsetDateTime.now(zoneIdUtc); // Fuso horário UTC
        OffsetDateTime offsetDateTimeUtcMinus3 = OffsetDateTime.now(zoneIdUtcMinus3); // Fuso horário de Brasília (UTC-3)
        OffsetDateTime offsetDateTimeUtcPlus1 = OffsetDateTime.now(zoneIdUtcPlus1); // Fuso horário de Londres (UTC+1)
        OffsetDateTime offsetDateTimeAsia = OffsetDateTime.now(zoneAsia); // Fuso horário do Japão

        System.out.println("OffsetDateTime: " + offsetDateTime);
        System.out.println("OffsetDateTime UTC: " + offsetDateTimeUtc);
        System.out.println("OffsetDateTime UTC-3 (Brasília): " + offsetDateTimeUtcMinus3);
        System.out.println("OffsetDateTime UTC+1 (Londres): " + offsetDateTimeUtcPlus1);
        System.out.println("OffsetDateTime Asia/Tokyo: " + offsetDateTimeAsia);

        System.out.println("------------------------");

        // DateTimeFormatter - formata datas e horas
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDate = localDateTime.format(formatter); // formata a data e hora
        String somenteDataSemHora = offsetDateTimeAsia.toLocalDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String somenteHoraSemData = localDateTime.toLocalTime().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        // ISO - Iso é um padrão de formatação de data e hora
        // ISO 8601 é um padrão internacional para representação de data e hora

        String iso8601DateTime = offsetDateTime.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME); // formata a data e hora no padrão ISO 8601


        System.out.println("Data e hora formatada: " + formattedDate);
        System.out.println("Somente data formatada: " + somenteDataSemHora);
        System.out.println("Somente hora formatada: " + somenteHoraSemData);
        System.out.println("Data e hora no formato ISO 8601: " + iso8601DateTime);
    }
}