<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

/**
 * @property int $partidoid
 * @property int $jugadorid
 * @property int $puntos
 * @property int $triples
 * @property boolean $amarilla
 * @property boolean $roja
 * @property int $faltas_b
 * @property Jugadore $jugadore
 * @property Partido $partido
 */
class partido_jugadors extends Model
{
    /**
     * @var array
     */
    protected $fillable = ['puntos', 'triples', 'amarilla', 'roja', 'faltas_b'];

    /**
     * @return \Illuminate\Database\Eloquent\Relations\BelongsTo
     */
    public function jugadore()
    {
        return $this->belongsTo('App\Jugadore', 'jugadorid', 'jugadorid');
    }

    /**
     * @return \Illuminate\Database\Eloquent\Relations\BelongsTo
     */
    public function partido()
    {
        return $this->belongsTo('App\Partido', 'partidoid', 'partidoid');
    }
}
