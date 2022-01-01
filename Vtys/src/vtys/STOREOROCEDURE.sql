CREATE PROCEDURE hastaRandevulariniGetir (IN hastaid INT)
BEGIN
SELECT randevu_id,doktor_adi,doktor_soyadi,klinik_adi,randevu_saat,randevu_tarih,hasta_adi,hasta_soyadi from randevular inner join doktorlar on randevular.doktor_id=doktorlar.doktor_id INNER JOIN hastalar on randevular.hasta_id=hastalar.hasta_id INNER JOIN klinikler on klinikler.klinik_id=doktorlar.klinik_id where randevular.hasta_id= hastaid;
END;
