SELECT 
	folio_contrato,
	id_status 
FROM 
	bdinteg:si_bpiusuarios 
WHERE 
	numcte = :#numcte