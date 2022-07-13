SELECT a.name, a.alias,ra.rating,RA.created_time from actor a
LEFT OUTER JOIN rating_actor ra on a.id = ra.actor_id
WHERE a.id = 1
ORDER BY ra.created_time DESC limit 1
