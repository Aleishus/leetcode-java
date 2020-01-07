select a.Score as Score,
(select count(distinct b.Score) from Scores b where b.Score >= a.Score) as Rank
from Scores a
order by a.Score DESC

SELECT Score, Rank FROM
(SELECT Score,
@curRank := IF(@prevRank = Score, @curRank+0,@curRank:=@curRank+1) AS Rank,
@prevRank := Score
FROM Scores, (
SELECT @curRank :=0, @prevRank := NULL
) r
ORDER BY Score DESC) s

/* todo sql 自变量，写法学习 if语句*/