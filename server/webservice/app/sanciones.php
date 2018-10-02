<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

/**
 * @property int $sancionid
 * @property int $jugadorid
 * @property string $tiempo
 * @property string $comentario
 * @property Jugadore $jugadore
 */
class sanciones extends Model
{
    /**
     * @var array
     */
    protected $fillable = ['tiempo', 'comentario'];

    /**
     * @return \Illuminate\Database\Eloquent\Relations\BelongsTo
     */
    public function jugadore()
    {
        return $this->belongsTo('App\Jugadore', 'jugadorid', 'jugadorid');
    }
}
