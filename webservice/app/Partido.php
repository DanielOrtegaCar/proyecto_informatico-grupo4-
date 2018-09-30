<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

/**
 * @property int $partidoid
 * @property int $equipo_1
 * @property int $equipo_2
 * @property int $divisionid
 * @property int $lugarid
 * @property int $ganador
 * @property string $fecha
 * @property string $hora
 * @property Divisione $divisione
 * @property Equipo $equipo
 * @property Equipo $equipo
 * @property Equipo $equipo
 * @property Lugare $lugare
 * @property Arbitraje[] $arbitrajes
 * @property PartidoJugador[] $partidoJugadors
 */
class partido extends Model
{
    /**
     * The primary key for the model.
     * 
     * @var string
     */
    protected $primaryKey = 'partidoid';

    /**
     * @var array
     */
    protected $fillable = ['equipo_1', 'equipo_2', 'divisionid', 'lugarid', 'ganador', 'fecha', 'hora'];

    /**
     * @return \Illuminate\Database\Eloquent\Relations\BelongsTo
     */
    public function divisione()
    {
        return $this->belongsTo('App\Divisione', 'divisionid', 'divisionid');
    }

    /**
     * @return \Illuminate\Database\Eloquent\Relations\BelongsTo
     */
    public function equipo()
    {
        return $this->belongsTo('App\Equipo', 'equipo_1', 'equipoid');
    }

    /**
     * @return \Illuminate\Database\Eloquent\Relations\BelongsTo
     */
    public function equipo()
    {
        return $this->belongsTo('App\Equipo', 'equipo_2', 'equipoid');
    }

    /**
     * @return \Illuminate\Database\Eloquent\Relations\BelongsTo
     */
    public function equipo()
    {
        return $this->belongsTo('App\Equipo', 'ganador', 'equipoid');
    }

    /**
     * @return \Illuminate\Database\Eloquent\Relations\BelongsTo
     */
    public function lugare()
    {
        return $this->belongsTo('App\Lugare', 'lugarid', 'lugarid');
    }

    /**
     * @return \Illuminate\Database\Eloquent\Relations\HasMany
     */
    public function arbitrajes()
    {
        return $this->hasMany('App\Arbitraje', 'partidoid', 'partidoid');
    }

    /**
     * @return \Illuminate\Database\Eloquent\Relations\HasMany
     */
    public function partidoJugadors()
    {
        return $this->hasMany('App\PartidoJugador', 'partidoid', 'partidoid');
    }
}
