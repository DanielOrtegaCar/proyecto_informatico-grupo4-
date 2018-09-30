<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

/**
 * @property int $divisionid
 * @property int $deporteid
 * @property string $nombre
 * @property Deporte $deporte
 * @property Campeonato[] $campeonatos
 * @property Equipo[] $equipos
 * @property Partido[] $partidos
 */
class divisiones extends Model
{
    /**
     * The primary key for the model.
     * 
     * @var string
     */
    protected $primaryKey = 'divisionid';

    /**
     * @var array
     */
    protected $fillable = ['deporteid', 'nombre'];

    /**
     * @return \Illuminate\Database\Eloquent\Relations\BelongsTo
     */
    public function deporte()
    {
        return $this->belongsTo('App\Deporte', 'deporteid', 'deporteid');
    }

    /**
     * @return \Illuminate\Database\Eloquent\Relations\HasMany
     */
    public function campeonatos()
    {
        return $this->hasMany('App\Campeonato', 'divisionid', 'divisionid');
    }

    /**
     * @return \Illuminate\Database\Eloquent\Relations\HasMany
     */
    public function equipos()
    {
        return $this->hasMany('App\Equipo', 'divisionid', 'divisionid');
    }

    /**
     * @return \Illuminate\Database\Eloquent\Relations\HasMany
     */
    public function partidos()
    {
        return $this->hasMany('App\Partido', 'divisionid', 'divisionid');
    }
}
