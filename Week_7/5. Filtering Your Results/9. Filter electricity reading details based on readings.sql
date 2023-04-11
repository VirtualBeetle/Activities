SELECT meter_id , total_units from electricity_reading 
WHERE h13 < h14 
ORDER BY total_units DESC;
